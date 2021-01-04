package pojo;

import java.util.Map;

public class ServerPeo {

    Map<String,People> map;

    public Map<String, People> getMap() {
        return map;
    }

    public void setMap(Map<String, People> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ServerPeo{" +
                "map=" + map +
                '}';
    }
}