import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public CreatorModel _creator;
	public VersionModel _version;
	public String type;
	public String logo;
	public String timezone;
	public String privacy;
	public String description;
	public String end_time;
	public String organizer_description;
	public String schedule_published_on;
	public String state;
	public String code_of_conduct;
	public String organizer_name;
	public CopyrightModel _copyright;
	public int id;
	public String location_name;

	public RootModel(String start_time, String name, ArrayList<Social_linksModel> social_links, String topic, String email, Call_for_papersModel call_for_papers, String background_image, CreatorModel creator, VersionModel version, String type, String logo, String timezone, String privacy, String description, String end_time, String organizer_description, String schedule_published_on, String state, String code_of_conduct, String organizer_name, CopyrightModel copyright, int id, String location_name) {

		this.start_time = start_time;
		this.name = name;
		this.social_links = social_links;
		this.topic = topic;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._creator = creator;
		this._version = version;
		this.type = type;
		this.logo = logo;
		this.timezone = timezone;
		this.privacy = privacy;
		this.description = description;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.id = id;
		this.location_name = location_name;

	}

}