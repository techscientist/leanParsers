import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String start_time;
	public CreatorModel _creator;
	public String state;
	public String location_name;
	public String organizer_description;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String topic;
	public String name;
	public int id;
	public VersionModel _version;
	public String timezone;
	public String code_of_conduct;
	public String logo;
	public String type;
	public String background_image;
	public String organizer_name;

	public RootModel(String schedule_published_on, CopyrightModel copyright, String start_time, CreatorModel creator, String state, String location_name, String organizer_description, String privacy, Call_for_papersModel call_for_papers, String email, String end_time, ArrayList<Social_linksModel> social_links, String description, String topic, String name, int id, VersionModel version, String timezone, String code_of_conduct, String logo, String type, String background_image, String organizer_name) {

		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.start_time = start_time;
		this._creator = creator;
		this.state = state;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.end_time = end_time;
		this.social_links = social_links;
		this.description = description;
		this.topic = topic;
		this.name = name;
		this.id = id;
		this._version = version;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.type = type;
		this.background_image = background_image;
		this.organizer_name = organizer_name;

	}

}