import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public int id;
	public String location_name;
	public VersionModel _version;
	public String description;
	public String privacy;
	public String state;
	public String timezone;
	public String email;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String logo;
	public CopyrightModel _copyright;
	public String type;
	public String name;
	public String code_of_conduct;
	public String end_time;
	public String start_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String organizer_description;

	public RootModel(String organizer_name, int id, String location_name, VersionModel version, String description, String privacy, String state, String timezone, String email, CreatorModel creator, ArrayList<Social_linksModel> social_links, String background_image, String logo, CopyrightModel copyright, String type, String name, String code_of_conduct, String end_time, String start_time, String schedule_published_on, Call_for_papersModel call_for_papers, String topic, String organizer_description) {

		this.organizer_name = organizer_name;
		this.id = id;
		this.location_name = location_name;
		this._version = version;
		this.description = description;
		this.privacy = privacy;
		this.state = state;
		this.timezone = timezone;
		this.email = email;
		this._creator = creator;
		this.social_links = social_links;
		this.background_image = background_image;
		this.logo = logo;
		this._copyright = copyright;
		this.type = type;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.organizer_description = organizer_description;

	}

}