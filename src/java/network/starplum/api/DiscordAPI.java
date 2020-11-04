package network.starplum.api;

import java.awt.Color;
import java.io.IOException;

import network.starplum.utils.DiscordWebhook;

public class DiscordAPI {

	public static void sendWebhook(String link, String contentMessage, String avatarURL, String webhookUsername, boolean tts,
			String embedTitle, String embedDescription, Color embedColor, String thumbnail, String footer,
			String footerImageURL, String author, String authorLink, String authorImageURL, String webhookLink,
			String image, String hookDescription
			) throws IOException {

		DiscordWebhook webhook = new DiscordWebhook(link);
		webhook.setContent(contentMessage);
		webhook.setAvatarUrl(avatarURL);
		webhook.setUsername(webhookUsername);
		webhook.setTts(tts);
		webhook.addEmbed(new DiscordWebhook.EmbedObject()
				.setTitle(embedTitle)
				.setDescription(embedDescription)
				.setColor(embedColor)
				.setThumbnail(thumbnail)
				.setFooter(footer, footerImageURL)
				.setImage(image)
				.setAuthor(author, authorLink, authorImageURL)
				.setUrl(webhookLink));
		webhook.addEmbed(new DiscordWebhook.EmbedObject()
				.setDescription(hookDescription));
		webhook.execute();

	}

	public static void sendEmbed(String url, String avatarURL, String avatarUsername,
			String embedTitle, String embedDescription, Color embedColor,
			String embedThumbnail, String footer, String footerURL,
			String author, String authorLink, String authorURL,
			String URL
			) throws IOException {
		DiscordWebhook webhook = new DiscordWebhook(url);
		webhook.setAvatarUrl(avatarURL);
		webhook.setUsername(avatarUsername);
		webhook.addEmbed(new DiscordWebhook.EmbedObject()
				.setTitle(embedTitle)
				.setDescription(embedDescription)
				.setColor(embedColor)
				.setThumbnail(embedThumbnail)
				.setFooter(footer, footerURL)
				.setAuthor(author, authorLink, authorURL)
				.setUrl(URL));
		webhook.execute();
	}

	public static void sendEmbed(String url, String avatarURL, String avatarUsername,
			String embedTitle, String embedDescription, Color embedColor,
			String embedThumbnail, String footer, String footerURL,
			String author, String authorLink, String authorURL,
			String URL, boolean tts
			) throws IOException {
		DiscordWebhook webhook = new DiscordWebhook(url);
		webhook.setAvatarUrl(avatarURL);
		webhook.setTts(tts);
		webhook.setUsername(avatarUsername);
		webhook.addEmbed(new DiscordWebhook.EmbedObject()
				.setTitle(embedTitle)
				.setDescription(embedDescription)
				.setColor(embedColor)
				.setThumbnail(embedThumbnail)
				.setFooter(footer, footerURL)
				.setAuthor(author, authorLink, authorURL)
				.setUrl(URL));
		webhook.execute();
	}
	
	public static void sendEmbedImage(String url, String avatarURL, String avatarUsername,
			String embedTitle, String embedDescription, Color embedColor,
			String embedImageURL, String footer, String footerURL,
			String author, String authorLink, String authorURL,
			String URL
			) throws IOException {
		DiscordWebhook webhook = new DiscordWebhook(url);
		webhook.setAvatarUrl(avatarURL);
		webhook.setUsername(avatarUsername);
		webhook.addEmbed(new DiscordWebhook.EmbedObject()
				.setTitle(embedTitle)
				.setDescription(embedDescription)
				.setImage(embedImageURL)
				.setColor(embedColor)
				.setFooter(footer, footerURL)
				.setAuthor(author, authorLink, authorURL)
				.setUrl(URL));
		webhook.execute();
	}

}
