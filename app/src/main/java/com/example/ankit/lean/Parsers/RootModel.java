import java.util.ArrayList;

class RootModel {

	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String schedule_published_on;
	public String organizer_name;
	public CreatorModel _creator;
	public String description;
	public VersionModel _version;
	public String state;
	public String email;
	public String location_name;
	public String start_time;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String topic;
	public String code_of_conduct;
	public String organizer_description;
	public String logo;
	public CopyrightModel _copyright;
	public String timezone;
	public int id;
	public String background_image;

	public RootModel(String name, ArrayList<Social_linksModel> social_links, String privacy, String schedule_published_on, String organizer_name, CreatorModel creator, String description, VersionModel version, String state, String email, String location_name, String start_time, String end_time, Call_for_papersModel call_for_papers, String type, String topic, String code_of_conduct, String organizer_description, String logo, CopyrightModel copyright, String timezone, int id, String background_image) {

		this.name = name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.description = description;
		this._version = version;
		this.state = state;
		this.email = email;
		this.location_name = location_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._copyright = copyright;
		this.timezone = timezone;
		this.id = id;
		this.background_image = background_image;

	}

}