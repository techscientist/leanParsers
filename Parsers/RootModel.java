import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String state;
	public String schedule_published_on;
	public String timezone;
	public String type;
	public String email;
	public String organizer_description;
	public VersionModel _version;
	public String background_image;
	public String name;
	public String topic;
	public int id;
	public String start_time;
	public CopyrightModel _copyright;
	public String logo;
	public CreatorModel _creator;
	public String organizer_name;
	public String location_name;

	public RootModel(String code_of_conduct, String privacy, ArrayList<Social_linksModel> social_links, String description, Call_for_papersModel call_for_papers, String end_time, String state, String schedule_published_on, String timezone, String type, String email, String organizer_description, VersionModel version, String background_image, String name, String topic, int id, String start_time, CopyrightModel copyright, String logo, CreatorModel creator, String organizer_name, String location_name) {

		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.social_links = social_links;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.type = type;
		this.email = email;
		this.organizer_description = organizer_description;
		this._version = version;
		this.background_image = background_image;
		this.name = name;
		this.topic = topic;
		this.id = id;
		this.start_time = start_time;
		this._copyright = copyright;
		this.logo = logo;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.location_name = location_name;

	}

}