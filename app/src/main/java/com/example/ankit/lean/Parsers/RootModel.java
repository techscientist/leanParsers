import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String state;
	public String type;
	public String description;
	public VersionModel _version;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public CopyrightModel _copyright;
	public String name;
	public int id;
	public String end_time;
	public String schedule_published_on;
	public String email;
	public String organizer_name;
	public String logo;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public CreatorModel _creator;
	public String start_time;
	public String topic;
	public String background_image;

	public RootModel(String privacy, String state, String type, String description, VersionModel version, String code_of_conduct, Call_for_papersModel call_for_papers, String location_name, CopyrightModel copyright, String name, int id, String end_time, String schedule_published_on, String email, String organizer_name, String logo, String timezone, ArrayList<Social_linksModel> social_links, String organizer_description, CreatorModel creator, String start_time, String topic, String background_image) {

		this.privacy = privacy;
		this.state = state;
		this.type = type;
		this.description = description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._copyright = copyright;
		this.name = name;
		this.id = id;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.timezone = timezone;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.start_time = start_time;
		this.topic = topic;
		this.background_image = background_image;

	}

}