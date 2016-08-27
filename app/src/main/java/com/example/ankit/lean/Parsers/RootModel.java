import java.util.ArrayList;

class RootModel {

	public String end_time;
	public VersionModel _version;
	public String schedule_published_on;
	public String start_time;
	public CopyrightModel _copyright;
	public String type;
	public String state;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public String description;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String timezone;
	public String logo;
	public String name;
	public String background_image;

	public RootModel(String end_time, VersionModel version, String schedule_published_on, String start_time, CopyrightModel copyright, String type, String state, String organizer_description, Call_for_papersModel call_for_papers, int id, String code_of_conduct, String organizer_name, String topic, String location_name, CreatorModel creator, String description, String privacy, ArrayList<Social_linksModel> social_links, String email, String timezone, String logo, String name, String background_image) {

		this.end_time = end_time;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._copyright = copyright;
		this.type = type;
		this.state = state;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this.description = description;
		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this.timezone = timezone;
		this.logo = logo;
		this.name = name;
		this.background_image = background_image;

	}

}