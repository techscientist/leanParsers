import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String privacy;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String state;
	public String start_time;
	public int id;
	public String organizer_name;
	public String name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String timezone;
	public String logo;
	public String end_time;
	public String type;
	public String organizer_description;
	public String topic;
	public String description;
	public String background_image;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String location_name, String privacy, String email, ArrayList<Social_linksModel> social_links, CreatorModel creator, String schedule_published_on, String state, String start_time, int id, String organizer_name, String name, VersionModel version, CopyrightModel copyright, String timezone, String logo, String end_time, String type, String organizer_description, String topic, String description, String background_image, String code_of_conduct, Call_for_papersModel call_for_papers) {

		this.location_name = location_name;
		this.privacy = privacy;
		this.email = email;
		this.social_links = social_links;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.start_time = start_time;
		this.id = id;
		this.organizer_name = organizer_name;
		this.name = name;
		this._version = version;
		this._copyright = copyright;
		this.timezone = timezone;
		this.logo = logo;
		this.end_time = end_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.description = description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;

	}

}