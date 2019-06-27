package org.zzwwsy.commons.processors;

import org.zzwwsy.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {
	
	public void onMessage(EventInMessage msg);
}
