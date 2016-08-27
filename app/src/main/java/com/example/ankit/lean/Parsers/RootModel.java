import java.util.ArrayList;

class RootModel {

	public String description;
	public String organizer_name;
	public String type;
	public String email;
	public String name;
	public CreatorModel _creator;
	public String start_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public VersionModel _version;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String schedule_published_on;
	public String privacy;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String background_image;
	public int id;
	public String state;
	public String timezone;
	public String organizer_description;

	public RootModel(String description, String organizer_name, String type, String email, String name, CreatorModel creator, String start_time, CopyrightModel copyright, String code_of_conduct, VersionModel version, String logo, Call_for_papersModel call_for_papers, String end_time, String schedule_published_on, String privacy, String location_name, ArrayList<Social_linksModel> social_links, String topic, String background_image, int id, String state, String timezone, String organizer_description) {

		this.description = description;
		this.organizer_name = organizer_name;
		this.type = type;
		this.email = email;
		this.name = name;
		this._creator = creator;
		this.start_time = start_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.location_name = location_name;
		this.social_links = social_links;
		this.topic = topic;
		this.background_image = background_image;
		this.id = id;
		this.state = state;
		this.timezone = timezone;
		this.organizer_description = organizer_description;

	}

}