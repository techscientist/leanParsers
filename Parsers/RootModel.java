import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String code_of_conduct;
	public String organizer_description;
	public String schedule_published_on;
	public String background_image;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String state;
	public String email;
	public String start_time;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String timezone;
	public String logo;
	public CopyrightModel _copyright;
	public String topic;
	public String description;
	public VersionModel _version;
	public String type;
	public int id;
	public String location_name;

	public RootModel(String organizer_name, String code_of_conduct, String organizer_description, String schedule_published_on, String background_image, String privacy, Call_for_papersModel call_for_papers, CreatorModel creator, String state, String email, String start_time, String end_time, ArrayList<Social_linksModel> social_links, String name, String timezone, String logo, CopyrightModel copyright, String topic, String description, VersionModel version, String type, int id, String location_name) {

		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.state = state;
		this.email = email;
		this.start_time = start_time;
		this.end_time = end_time;
		this.social_links = social_links;
		this.name = name;
		this.timezone = timezone;
		this.logo = logo;
		this._copyright = copyright;
		this.topic = topic;
		this.description = description;
		this._version = version;
		this.type = type;
		this.id = id;
		this.location_name = location_name;

	}

}