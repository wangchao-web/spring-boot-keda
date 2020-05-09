package com.kedacom.configuration;

import com.kedacom.pojo.User;
import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 *@PropertySource ; 加载指定的配置文件
 */
@Configuration
@Component
//@ConfigurationProperties(prefix = "person")
@Validated
//@PropertySource(value = {"classpath:person.properties"})
public class PersonConfiguration {


    /**
     * <bean class="Person">
     *      <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></property>
     * <bean/>
     */

    public PersonConfiguration(String name, int age, boolean boo, Date date, Map<String, Object> map, List<User> list, User user) {
        this.name = name;
        this.age = age;
        this.boo = boo;
        this.date = date;
        this.map = map;
        this.list = list;
        this.user = user;
    }

    public PersonConfiguration() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PersonConfiguration{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boo=" + boo +
                ", date=" + date +
                ", map=" + map +
                ", list=" + list +
                ", user=" + user +
                '}';
    }
    @Email
    @Value("${person.name}")
    private String name;
    private int age;
    private boolean boo;
    private Date date;
    private Map<String,Object> map;
    private List<User> list;
    private User user;
}
