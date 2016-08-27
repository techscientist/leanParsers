import java.util.ArrayList;

class RootModel {

	public String type;
	public CreatorModel _creator;
	public String email;
	public String schedule_published_on;
	public String state;
	public String code_of_conduct;
	public String logo;
	public String timezone;
	public String start_time;
	public String privacy;
	public String name;
	public String background_image;
	public int id;
	public VersionModel _version;
	public String description;
	public String topic;
	public String organizer_description;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String end_time;
	public String organizer_name;

	public RootModel(String type, CreatorModel creator, String email, String schedule_published_on, String state, String code_of_conduct, String logo, String timezone, String start_time, String privacy, String name, String background_image, int id, VersionModel version, String description, String topic, String organizer_description, String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String end_time, String organizer_name) {

		this.type = type;
		this._creator = creator;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.timezone = timezone;
		this.start_time = start_time;
		this.privacy = privacy;
		this.name = name;
		this.background_image = background_image;
		this.id = id;
		this._version = version;
		this.description = description;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._copyright = copyright;
		this.end_time = end_time;
		this.organizer_name = organizer_name;

	}

}