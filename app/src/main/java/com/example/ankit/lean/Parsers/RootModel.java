import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String location_name;
	public String code_of_conduct;
	public String end_time;
	public VersionModel _version;
	public String logo;
	public CopyrightModel _copyright;
	public String privacy;
	public CreatorModel _creator;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String description;
	public String email;
	public int id;
	public String organizer_name;
	public String state;
	public String schedule_published_on;
	public String start_time;
	public String timezone;
	public String type;
	public String background_image;

	public RootModel(String organizer_description, String location_name, String code_of_conduct, String end_time, VersionModel version, String logo, CopyrightModel copyright, String privacy, CreatorModel creator, String topic, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String name, String description, String email, int id, String organizer_name, String state, String schedule_published_on, String start_time, String timezone, String type, String background_image) {

		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._version = version;
		this.logo = logo;
		this._copyright = copyright;
		this.privacy = privacy;
		this._creator = creator;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.name = name;
		this.description = description;
		this.email = email;
		this.id = id;
		this.organizer_name = organizer_name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.timezone = timezone;
		this.type = type;
		this.background_image = background_image;

	}

}