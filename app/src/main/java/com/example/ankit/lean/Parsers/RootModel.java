import java.util.ArrayList;

class RootModel {

	public String email;
	public String topic;
	public String privacy;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String end_time;
	public String organizer_name;
	public String state;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String description;
	public String logo;
	public String code_of_conduct;
	public int id;
	public VersionModel _version;
	public String type;
	public String start_time;
	public String organizer_description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String name;

	public RootModel(String email, String topic, String privacy, String background_image, ArrayList<Social_linksModel> social_links, String schedule_published_on, String end_time, String organizer_name, String state, CreatorModel creator, CopyrightModel copyright, String description, String logo, String code_of_conduct, int id, VersionModel version, String type, String start_time, String organizer_description, String timezone, Call_for_papersModel call_for_papers, String location_name, String name) {

		this.email = email;
		this.topic = topic;
		this.privacy = privacy;
		this.background_image = background_image;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.state = state;
		this._creator = creator;
		this._copyright = copyright;
		this.description = description;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._version = version;
		this.type = type;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.name = name;

	}

}