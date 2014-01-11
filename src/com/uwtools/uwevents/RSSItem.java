package com.uwtools.uwevents;

/**
 * This class handle RSS Item <item> node in rss xml
 */
public class RSSItem {

	// All <item> node name
	protected String _title;
	protected String _link;
	protected String _description;
	protected String _pubdate;
	protected String _guid;

	// constructors
	public RSSItem(){

	}

	public RSSItem(String title, String link, String description, String pubdate, String guid){
		this._title = title;
		this._link = link;
		this._description = description;
		this._pubdate = pubdate;
		this._guid = guid;
	}

	/**
	 * setters
	 */
	public void setTitle(String title){
		this._title = title;
	}

	public void setLink(String link){
		this._link = link;
	}

	public void setDescription(String description){
		this._description = description;
	}

	public void setPubdate(String pubDate){
		this._pubdate = pubDate;
	}


	public void setGuid(String guid){
		this._guid = guid;
	}

	/**
	 * getters
	 */
	 public String getTitle(){
		 return this._title;
	 }

	 public String getLink(){
		 return this._link;
	 }

	 public String getDescription(){
		 return this._description;
	 }

	 public String getPubdate(){
		 return this._pubdate;
	 }

	 public String getGuid(){
		 return this._guid;
	 }
}