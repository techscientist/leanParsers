import java.util.ArrayList;

class RootModel {

	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String topic;
	public String background_image;
	public VersionModel _version;
	public String schedule_published_on;
	public String start_time;
	public int id;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String privacy;
	public String email;
	public CopyrightModel _copyright;
	public String name;
	public String logo;
	public String description;
	public String type;
	public String organizer_description;
	public String timezone;
	public String end_time;
	public String organizer_name;

	public RootModel(String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, String topic, String background_image, VersionModel version, String schedule_published_on, String start_time, int id, String state, ArrayList<Social_linksModel> social_links, String code_of_conduct, String privacy, String email, CopyrightModel copyright, String name, String logo, String description, String type, String organizer_description, String timezone, String end_time, String organizer_name) {

		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.topic = topic;
		this.background_image = background_image;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.id = id;
		this.state = state;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.email = email;
		this._copyright = copyright;
		this.name = name;
		this.logo = logo;
		this.description = description;
		this.type = type;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.end_time = end_time;
		this.organizer_name = organizer_name;

	}

}