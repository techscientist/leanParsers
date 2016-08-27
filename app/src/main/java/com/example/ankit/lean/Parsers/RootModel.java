import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public int id;
	public String schedule_published_on;
	public String description;
	public String timezone;
	public String code_of_conduct;
	public String location_name;
	public String organizer_description;
	public String privacy;
	public CreatorModel _creator;
	public String start_time;
	public String end_time;
	public String type;
	public VersionModel _version;
	public String state;
	public String topic;
	public String name;
	public String organizer_name;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String background_image;

	public RootModel(CopyrightModel copyright, int id, String schedule_published_on, String description, String timezone, String code_of_conduct, String location_name, String organizer_description, String privacy, CreatorModel creator, String start_time, String end_time, String type, VersionModel version, String state, String topic, String name, String organizer_name, String logo, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String email, String background_image) {

		this._copyright = copyright;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._creator = creator;
		this.start_time = start_time;
		this.end_time = end_time;
		this.type = type;
		this._version = version;
		this.state = state;
		this.topic = topic;
		this.name = name;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.background_image = background_image;

	}

}