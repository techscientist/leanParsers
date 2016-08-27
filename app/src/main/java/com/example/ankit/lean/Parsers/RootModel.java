import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String logo;
	public String end_time;
	public String email;
	public String organizer_description;
	public String organizer_name;
	public String code_of_conduct;
	public String privacy;
	public String name;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String location_name;
	public String description;
	public String state;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public int id;
	public String topic;
	public CopyrightModel _copyright;

	public RootModel(VersionModel version, String timezone, Call_for_papersModel call_for_papers, String type, String logo, String end_time, String email, String organizer_description, String organizer_name, String code_of_conduct, String privacy, String name, CreatorModel creator, String schedule_published_on, String location_name, String description, String state, String start_time, ArrayList<Social_linksModel> social_links, String background_image, int id, String topic, CopyrightModel copyright) {

		this._version = version;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.logo = logo;
		this.end_time = end_time;
		this.email = email;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.name = name;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.description = description;
		this.state = state;
		this.start_time = start_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.id = id;
		this.topic = topic;
		this._copyright = copyright;

	}

}