import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String description;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String logo;
	public String schedule_published_on;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String start_time;
	public String background_image;
	public CreatorModel _creator;
	public String type;
	public String email;
	public String topic;
	public String state;
	public String code_of_conduct;
	public String organizer_name;
	public String end_time;
	public String timezone;
	public String organizer_description;
	public CopyrightModel _copyright;

	public RootModel(VersionModel version, String description, int id, ArrayList<Social_linksModel> social_links, String name, String logo, String schedule_published_on, String location_name, Call_for_papersModel call_for_papers, String privacy, String start_time, String background_image, CreatorModel creator, String type, String email, String topic, String state, String code_of_conduct, String organizer_name, String end_time, String timezone, String organizer_description, CopyrightModel copyright) {

		this._version = version;
		this.description = description;
		this.id = id;
		this.social_links = social_links;
		this.name = name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.start_time = start_time;
		this.background_image = background_image;
		this._creator = creator;
		this.type = type;
		this.email = email;
		this.topic = topic;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._copyright = copyright;

	}

}