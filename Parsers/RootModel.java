import java.util.ArrayList;

class RootModel {

	public String name;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String email;
	public CopyrightModel _copyright;
	public String start_time;
	public String topic;
	public String code_of_conduct;
	public int id;
	public String end_time;
	public String type;
	public String description;
	public String logo;
	public String organizer_description;
	public String state;
	public String schedule_published_on;
	public VersionModel _version;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String timezone;
	public CreatorModel _creator;

	public RootModel(String name, String organizer_name, ArrayList<Social_linksModel> social_links, String location_name, String email, CopyrightModel copyright, String start_time, String topic, String code_of_conduct, int id, String end_time, String type, String description, String logo, String organizer_description, String state, String schedule_published_on, VersionModel version, String background_image, Call_for_papersModel call_for_papers, String privacy, String timezone, CreatorModel creator) {

		this.name = name;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.location_name = location_name;
		this.email = email;
		this._copyright = copyright;
		this.start_time = start_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.end_time = end_time;
		this.type = type;
		this.description = description;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.timezone = timezone;
		this._creator = creator;

	}

}