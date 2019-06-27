package org.zzwwsy.weixin.processors.impl;

import org.springframework.stereotype.Service;
import org.zzwwsy.commons.domain.event.EventInMessage;
import org.zzwwsy.commons.processors.EventMessageProcessor;

@Service("unsubscribeMessageProcessor")
public class UnsubscribeEventMessageProcessor implements EventMessageProcessor {

	@Override
	public void onMessage(EventInMessage msg) {
		// 把用户的数据删除或者标记为已经取消关注即可
	}
}
