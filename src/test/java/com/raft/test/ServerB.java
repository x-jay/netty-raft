package com.raft.test;

import com.raft.bootstrap.ServerStartup;
import com.raft.domain.Server;

/**
 * Created by Administrator on 2016/10/28.
 */
public class ServerB {
    public static void main(String[] args) {
        Server[] servers = new Server[2];
        servers[0] = new Server("127.0.0.1",1001);
//        servers[1] = new Server("127.0.0.1",1002);
        servers[1] = new Server("127.0.0.1",1003);

        new ServerStartup(1002,servers).startUp();
    }
}
