import java.util.ArrayList;

class RootModel {

	public String name;
	public String end_time;
	public String timezone;
	public CreatorModel _creator;
	public String organizer_description;
	public String privacy;
	public String background_image;
	public String state;
	public VersionModel _version;
	public String schedule_published_on;
	public int id;
	public String topic;
	public CopyrightModel _copyright;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String organizer_name;
	public String logo;
	public String email;
	public String location_name;

	public RootModel(String name, String end_time, String timezone, CreatorModel creator, String organizer_description, String privacy, String background_image, String state, VersionModel version, String schedule_published_on, int id, String topic, CopyrightModel copyright, String start_time, Call_for_papersModel call_for_papers, String type, String code_of_conduct, ArrayList<Social_linksModel> social_links, String description, String organizer_name, String logo, String email, String location_name) {

		this.name = name;
		this.end_time = end_time;
		this.timezone = timezone;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.background_image = background_image;
		this.state = state;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.topic = topic;
		this._copyright = copyright;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.description = description;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.email = email;
		this.location_name = location_name;

	}

}