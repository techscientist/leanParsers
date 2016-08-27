import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String topic;
	public String description;
	public String logo;
	public VersionModel _version;
	public String state;
	public String code_of_conduct;
	public String privacy;
	public CreatorModel _creator;
	public int id;
	public String timezone;
	public String start_time;
	public String background_image;
	public String email;
	public String schedule_published_on;
	public String organizer_description;
	public String end_time;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String name;

	public RootModel(CopyrightModel copyright, String location_name, ArrayList<Social_linksModel> social_links, String organizer_name, String topic, String description, String logo, VersionModel version, String state, String code_of_conduct, String privacy, CreatorModel creator, int id, String timezone, String start_time, String background_image, String email, String schedule_published_on, String organizer_description, String end_time, String type, Call_for_papersModel call_for_papers, String name) {

		this._copyright = copyright;
		this.location_name = location_name;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.description = description;
		this.logo = logo;
		this._version = version;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._creator = creator;
		this.id = id;
		this.timezone = timezone;
		this.start_time = start_time;
		this.background_image = background_image;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.name = name;

	}

}