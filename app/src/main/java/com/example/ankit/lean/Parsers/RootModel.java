import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String state;
	public int id;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String organizer_description;
	public String organizer_name;
	public String start_time;
	public String location_name;
	public VersionModel _version;
	public String timezone;
	public String logo;
	public String code_of_conduct;
	public String email;
	public String end_time;
	public CreatorModel _creator;
	public String background_image;
	public String type;
	public String description;
	public String schedule_published_on;
	public String privacy;
	public Call_for_papersModel _call_for_papers;

	public RootModel(CopyrightModel copyright, String state, int id, String name, ArrayList<Social_linksModel> social_links, String topic, String organizer_description, String organizer_name, String start_time, String location_name, VersionModel version, String timezone, String logo, String code_of_conduct, String email, String end_time, CreatorModel creator, String background_image, String type, String description, String schedule_published_on, String privacy, Call_for_papersModel call_for_papers) {

		this._copyright = copyright;
		this.state = state;
		this.id = id;
		this.name = name;
		this.social_links = social_links;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.location_name = location_name;
		this._version = version;
		this.timezone = timezone;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.end_time = end_time;
		this._creator = creator;
		this.background_image = background_image;
		this.type = type;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;

	}

}