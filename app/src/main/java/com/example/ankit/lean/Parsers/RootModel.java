import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String type;
	public String start_time;
	public String description;
	public String logo;
	public String state;
	public String timezone;
	public int id;
	public VersionModel _version;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String name;
	public String organizer_name;
	public String email;
	public String privacy;
	public String topic;
	public String schedule_published_on;
	public String location_name;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String background_image, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String end_time, String type, String start_time, String description, String logo, String state, String timezone, int id, VersionModel version, CreatorModel creator, String code_of_conduct, String name, String organizer_name, String email, String privacy, String topic, String schedule_published_on, String location_name, String organizer_description, Call_for_papersModel call_for_papers) {

		this.background_image = background_image;
		this._copyright = copyright;
		this.social_links = social_links;
		this.end_time = end_time;
		this.type = type;
		this.start_time = start_time;
		this.description = description;
		this.logo = logo;
		this.state = state;
		this.timezone = timezone;
		this.id = id;
		this._version = version;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.organizer_name = organizer_name;
		this.email = email;
		this.privacy = privacy;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;

	}

}