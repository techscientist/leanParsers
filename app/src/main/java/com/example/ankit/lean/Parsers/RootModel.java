import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String organizer_name;
	public VersionModel _version;
	public String description;
	public String topic;
	public String email;
	public String logo;
	public String location_name;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String privacy;
	public String background_image;
	public String timezone;
	public String organizer_description;
	public String state;
	public String type;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String schedule_published_on;
	public String end_time;
	public String name;

	public RootModel(String start_time, String organizer_name, VersionModel version, String description, String topic, String email, String logo, String location_name, String code_of_conduct, ArrayList<Social_linksModel> social_links, CreatorModel creator, String privacy, String background_image, String timezone, String organizer_description, String state, String type, CopyrightModel copyright, Call_for_papersModel call_for_papers, int id, String schedule_published_on, String end_time, String name) {

		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.description = description;
		this.topic = topic;
		this.email = email;
		this.logo = logo;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._creator = creator;
		this.privacy = privacy;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.state = state;
		this.type = type;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.name = name;

	}

}