import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_description;
	public String logo;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String location_name;
	public String timezone;
	public String state;
	public CopyrightModel _copyright;
	public String privacy;
	public CreatorModel _creator;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public VersionModel _version;
	public String schedule_published_on;
	public String code_of_conduct;
	public String name;
	public String type;
	public int id;
	public String email;
	public String end_time;

	public RootModel(String background_image, String organizer_description, String logo, String description, Call_for_papersModel call_for_papers, String start_time, String location_name, String timezone, String state, CopyrightModel copyright, String privacy, CreatorModel creator, String organizer_name, ArrayList<Social_linksModel> social_links, String topic, VersionModel version, String schedule_published_on, String code_of_conduct, String name, String type, int id, String email, String end_time) {

		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.location_name = location_name;
		this.timezone = timezone;
		this.state = state;
		this._copyright = copyright;
		this.privacy = privacy;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.topic = topic;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.type = type;
		this.id = id;
		this.email = email;
		this.end_time = end_time;

	}

}