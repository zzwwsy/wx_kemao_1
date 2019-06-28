package org.zzwwsy.commons.domain.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.zzwwsy.commons.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD) // JAXB从字段获取配置信息
@XmlRootElement(name = "xml") 			// JAXB读取XML时根元素名称
public class EventInMessage extends InMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "Event")
	@JsonProperty("Event")
	private String event;
	@XmlElement(name = "EventKey")
	@JsonProperty("EventKey")
	private String eventKey;

	public String getEvent(){
		return event;
	}

	public void setEvent(String event){
		this.event = event;
	}

	public String getEventKey(){
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
}
