package com.project.helper;

import ru.yandex.qatools.properties.PropertyLoader;
        import ru.yandex.qatools.properties.annotations.Property;
        import ru.yandex.qatools.properties.annotations.Resource;

@Resource.Classpath("project.properties")
public class TestConfig {

    @Property("environment.url")
    private String url;

    public TestConfig() {
        PropertyLoader.populate(this);
    }

    public String getUrl() {
        return url;
    }
}