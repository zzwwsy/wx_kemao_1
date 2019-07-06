package org.zzwwsy.commons.domain.image;

import org.zzwwsy.commons.domain.OutMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageOutMessage extends OutMessage {
	public static class Media {
		@JsonProperty("media_id")
		private String mediaId;

		public String getMediaId() {
			return mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
	}

	private Media image;

	public ImageOutMessage(String toUser, String mediaId) {
		super.setMessageType("image");
		super.setToUser(toUser);
		this.image = new Media();
		this.image.mediaId = mediaId;
	}

	public Media getImage() {
		return image;
	}

	public void setImage(Media image) {
		this.image = image;
	}

}
