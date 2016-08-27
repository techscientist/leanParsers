import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String email;
	public int id;
	public String description;
	public String code_of_conduct;
	public String topic;
	public String name;
	public CopyrightModel _copyright;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String type;
	public String state;
	public String timezone;
	public String logo;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String location_name;
	public String background_image;
	public String privacy;
	public VersionModel _version;
	public String organizer_name;

	public RootModel(String start_time, String email, int id, String description, String code_of_conduct, String topic, String name, CopyrightModel copyright, String end_time, Call_for_papersModel call_for_papers, CreatorModel creator, String type, String state, String timezone, String logo, String organizer_description, ArrayList<Social_linksModel> social_links, String schedule_published_on, String location_name, String background_image, String privacy, VersionModel version, String organizer_name) {

		this.start_time = start_time;
		this.email = email;
		this.id = id;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.name = name;
		this._copyright = copyright;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.type = type;
		this.state = state;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.background_image = background_image;
		this.privacy = privacy;
		this._version = version;
		this.organizer_name = organizer_name;

	}

}