package core.controller;

import org.springframework.lang.NonNull;

import java.util.Objects;

public class Request {

	Long postId;
	String message;

	public Request() {
	}

	public Request(Long postId, String message) {
		this.postId = postId;
		this.message = message;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Request request = (Request) o;
		return Objects.equals(postId, request.postId) && Objects.equals(message, request.message);
	}

	@Override
	public int hashCode() {

		return Objects.hash(postId, message);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Request{");
		sb.append("postId=").append(postId);
		sb.append(", message='").append(message).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
