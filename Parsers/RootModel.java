import java.util.ArrayList;

class RootModel {

	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String type;
	public String email;
	public String end_time;
	public CreatorModel _creator;
	public String topic;
	public VersionModel _version;
	public String name;
	public String background_image;
	public String code_of_conduct;
	public String schedule_published_on;
	public String location_name;
	public String logo;
	public String privacy;
	public String organizer_description;
	public int id;
	public CopyrightModel _copyright;
	public String timezone;
	public String start_time;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String state, ArrayList<Social_linksModel> social_links, String description, String type, String email, String end_time, CreatorModel creator, String topic, VersionModel version, String name, String background_image, String code_of_conduct, String schedule_published_on, String location_name, String logo, String privacy, String organizer_description, int id, CopyrightModel copyright, String timezone, String start_time, String organizer_name, Call_for_papersModel call_for_papers) {

		this.state = state;
		this.social_links = social_links;
		this.description = description;
		this.type = type;
		this.email = email;
		this.end_time = end_time;
		this._creator = creator;
		this.topic = topic;
		this._version = version;
		this.name = name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.logo = logo;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.id = id;
		this._copyright = copyright;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;

	}

}