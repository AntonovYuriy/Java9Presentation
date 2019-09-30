module com.example.reflection.problem.demo.main {
    requires java.xml.bind;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.tx;
    requires spring.web;
    requires spring.webmvc;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter.data.jpa;
    requires net.bytebuddy;
    requires java.sql;
    opens com.example.reflection.problem.demo;
    opens com.example.reflection.problem.demo.entity to org.hibernate.orm.core, spring.core;
    opens com.example.reflection.problem.demo.repositories to org.hibernate.orm.core, spring.core;
}