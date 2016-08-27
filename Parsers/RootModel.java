import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String background_image;
	public String email;
	public String description;
	public String timezone;
	public String code_of_conduct;
	public VersionModel _version;
	public String state;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public int id;
	public String organizer_description;
	public String schedule_published_on;
	public String organizer_name;
	public String logo;
	public String start_time;
	public String privacy;
	public String name;
	public String topic;
	public String location_name;

	public RootModel(CopyrightModel copyright, String background_image, String email, String description, String timezone, String code_of_conduct, VersionModel version, String state, String end_time, Call_for_papersModel call_for_papers, String type, ArrayList<Social_linksModel> social_links, CreatorModel creator, int id, String organizer_description, String schedule_published_on, String organizer_name, String logo, String start_time, String privacy, String name, String topic, String location_name) {

		this._copyright = copyright;
		this.background_image = background_image;
		this.email = email;
		this.description = description;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.state = state;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.social_links = social_links;
		this._creator = creator;
		this.id = id;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.start_time = start_time;
		this.privacy = privacy;
		this.name = name;
		this.topic = topic;
		this.location_name = location_name;

	}

}