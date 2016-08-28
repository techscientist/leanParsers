import java.util.ArrayList;

class RootModel {

	public String description;
	public String organizer_description;
	public String timezone;
	public String start_time;
	public String end_time;
	public String organizer_name;
	public String topic;
	public String name;
	public CreatorModel _creator;
	public String type;
	public int id;
	public String email;
	public String privacy;
	public String state;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String background_image;
	public String schedule_published_on;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String location_name;

	public RootModel(String description, String organizer_description, String timezone, String start_time, String end_time, String organizer_name, String topic, String name, CreatorModel creator, String type, int id, String email, String privacy, String state, VersionModel version, ArrayList<Social_linksModel> social_links, String logo, String background_image, String schedule_published_on, String code_of_conduct, CopyrightModel copyright, Call_for_papersModel call_for_papers, String location_name) {

		this.description = description;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.name = name;
		this._creator = creator;
		this.type = type;
		this.id = id;
		this.email = email;
		this.privacy = privacy;
		this.state = state;
		this._version = version;
		this.social_links = social_links;
		this.logo = logo;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;

	}

}