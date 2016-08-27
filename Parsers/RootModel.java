import java.util.ArrayList;

class RootModel {

	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String name;
	public String organizer_name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String background_image;
	public String topic;
	public String location_name;
	public String end_time;
	public String description;
	public String type;
	public String organizer_description;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String state;
	public String privacy;
	public int id;
	public String logo;
	public String schedule_published_on;
	public CreatorModel _creator;

	public RootModel(String email, ArrayList<Social_linksModel> social_links, String timezone, String name, String organizer_name, String start_time, Call_for_papersModel call_for_papers, VersionModel version, String background_image, String topic, String location_name, String end_time, String description, String type, String organizer_description, String code_of_conduct, CopyrightModel copyright, String state, String privacy, int id, String logo, String schedule_published_on, CreatorModel creator) {

		this.email = email;
		this.social_links = social_links;
		this.timezone = timezone;
		this.name = name;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.background_image = background_image;
		this.topic = topic;
		this.location_name = location_name;
		this.end_time = end_time;
		this.description = description;
		this.type = type;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.state = state;
		this.privacy = privacy;
		this.id = id;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;

	}

}