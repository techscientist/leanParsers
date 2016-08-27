import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String logo;
	public String organizer_description;
	public String schedule_published_on;
	public String name;
	public String topic;
	public String background_image;
	public int id;
	public String description;
	public CreatorModel _creator;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String state;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String privacy;
	public String type;
	public String email;
	public String code_of_conduct;
	public String timezone;
	public String organizer_name;

	public RootModel(String end_time, String logo, String organizer_description, String schedule_published_on, String name, String topic, String background_image, int id, String description, CreatorModel creator, String location_name, ArrayList<Social_linksModel> social_links, VersionModel version, String state, CopyrightModel copyright, Call_for_papersModel call_for_papers, String start_time, String privacy, String type, String email, String code_of_conduct, String timezone, String organizer_name) {

		this.end_time = end_time;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.topic = topic;
		this.background_image = background_image;
		this.id = id;
		this.description = description;
		this._creator = creator;
		this.location_name = location_name;
		this.social_links = social_links;
		this._version = version;
		this.state = state;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.privacy = privacy;
		this.type = type;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_name = organizer_name;

	}

}