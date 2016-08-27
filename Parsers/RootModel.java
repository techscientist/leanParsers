import java.util.ArrayList;

class RootModel {

	public String logo;
	public int id;
	public String timezone;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String state;
	public VersionModel _version;
	public String privacy;
	public String location_name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String description;
	public String organizer_name;
	public String type;
	public CopyrightModel _copyright;
	public String end_time;
	public String topic;
	public String background_image;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String name;

	public RootModel(String logo, int id, String timezone, String code_of_conduct, CreatorModel creator, String state, VersionModel version, String privacy, String location_name, String start_time, ArrayList<Social_linksModel> social_links, String organizer_description, String description, String organizer_name, String type, CopyrightModel copyright, String end_time, String topic, String background_image, String email, Call_for_papersModel call_for_papers, String schedule_published_on, String name) {

		this.logo = logo;
		this.id = id;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.state = state;
		this._version = version;
		this.privacy = privacy;
		this.location_name = location_name;
		this.start_time = start_time;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.description = description;
		this.organizer_name = organizer_name;
		this.type = type;
		this._copyright = copyright;
		this.end_time = end_time;
		this.topic = topic;
		this.background_image = background_image;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.name = name;

	}

}