package com.raft.codec;

import com.raft.protocol.CustomDecoder;
import com.raft.protocol.CustomEncoder;
import io.netty.channel.CombinedChannelDuplexHandler;

/**
 * Created by Administrator on 2016/10/31.
 */
public class CustomCodec extends CombinedChannelDuplexHandler<CustomDecoder,CustomEncoder> {
    public CustomCodec()
    {

    }
}
