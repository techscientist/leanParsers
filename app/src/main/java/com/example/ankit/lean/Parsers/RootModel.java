import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String description;
	public String email;
	public String organizer_description;
	public String timezone;
	public String topic;
	public String end_time;
	public int id;
	public String state;
	public String name;
	public String type;
	public CopyrightModel _copyright;
	public String privacy;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String background_image;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String logo;
	public String organizer_name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String code_of_conduct, String description, String email, String organizer_description, String timezone, String topic, String end_time, int id, String state, String name, String type, CopyrightModel copyright, String privacy, String start_time, ArrayList<Social_linksModel> social_links, String location_name, String background_image, CreatorModel creator, String schedule_published_on, String logo, String organizer_name, VersionModel version, Call_for_papersModel call_for_papers) {

		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.email = email;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.topic = topic;
		this.end_time = end_time;
		this.id = id;
		this.state = state;
		this.name = name;
		this.type = type;
		this._copyright = copyright;
		this.privacy = privacy;
		this.start_time = start_time;
		this.social_links = social_links;
		this.location_name = location_name;
		this.background_image = background_image;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._version = version;
		this._call_for_papers = call_for_papers;

	}

}