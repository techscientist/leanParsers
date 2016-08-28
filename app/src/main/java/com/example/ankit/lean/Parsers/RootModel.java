import java.util.ArrayList;

class RootModel {

	public String description;
	public String timezone;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String end_time;
	public String name;
	public String state;
	public CreatorModel _creator;
	public String type;
	public String start_time;
	public int id;
	public String privacy;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String email;
	public String location_name;
	public VersionModel _version;
	public String logo;
	public String organizer_description;
	public String schedule_published_on;
	public String background_image;

	public RootModel(String description, String timezone, CopyrightModel copyright, String organizer_name, String end_time, String name, String state, CreatorModel creator, String type, String start_time, int id, String privacy, String topic, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String code_of_conduct, String email, String location_name, VersionModel version, String logo, String organizer_description, String schedule_published_on, String background_image) {

		this.description = description;
		this.timezone = timezone;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.name = name;
		this.state = state;
		this._creator = creator;
		this.type = type;
		this.start_time = start_time;
		this.id = id;
		this.privacy = privacy;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.location_name = location_name;
		this._version = version;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;

	}

}