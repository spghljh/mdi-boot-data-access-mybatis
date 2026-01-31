package kr.co.mdi.common.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = {
    "kr.co.mdi.cpu.mapper",
    "kr.co.mdi.device.mapper",
    "kr.co.mdi.member.mapper"
})
public class MyBatisConfig {
    private final Environment env;

    public MyBatisConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);

        // MyBatis Configuration 객체 생성
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        // SQL 로그를 StdOut(System.out)으로 출력
        configuration.setLogImpl(org.apache.ibatis.logging.stdout.StdOutImpl.class);
        factoryBean.setConfiguration(configuration);

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        String[] activeProfiles = env.getActiveProfiles();
        String profile = (activeProfiles.length > 0) ? activeProfiles[0] : "default";

        String mapperPath;
        switch (profile) {
            case "dev-user-mysql":
                mapperPath = "classpath:mapper/mysql/*.xml";
                break;
            case "dev-user-oracle":
                mapperPath = "classpath:mapper/oracle/*.xml";
                break;
            case "dev-user-postgre":
                mapperPath = "classpath:mapper/postgres/*.xml";
                break;
            case "dev-user-mssql":
                mapperPath = "classpath:mapper/mssql/*.xml";
                break;
            default:
                mapperPath = "classpath:mapper/mysql/*.xml";
        }

        factoryBean.setMapperLocations(resolver.getResources(mapperPath));
        return factoryBean.getObject();
    }
}
