package com.uwtools.uwevents;
import java.util.List;

public class RSSFeed {
	//xml nodes
	protected String _title;
	protected String _description;
	protected String _link;
	protected String _rss_link;
	protected String _language;
	protected List <RSSItem> _items;

	// constructor
	public RSSFeed(String title, String description, String link,
			String rss_link, String language) {
		this._title = title;
		this._description = description;
		this._link = link;
		this._rss_link = rss_link;
		this._language = language;
	}

	/**
	 * setters
	 */
	public void setItems(List<RSSItem> items) {
		this._items = items;
	}

	/**
	 * getters
	 */
	public List<RSSItem> getItems() {
		return this._items;
	}

	public String getTitle() {
		return this._title;
	}

	public String getDescription() {
		return this._description;
	}

	public String getLink() {
		return this._link;
	}

	public String getRSSLink() {
		return this._rss_link;
	}

	public String getLanguage() {
		return this._language;
	}
}
