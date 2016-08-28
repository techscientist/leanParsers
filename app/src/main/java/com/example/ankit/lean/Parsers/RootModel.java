import java.util.ArrayList;

class RootModel {

	public String type;
	public String organizer_name;
	public String start_time;
	public String code_of_conduct;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CreatorModel _creator;
	public String email;
	public CopyrightModel _copyright;
	public String end_time;
	public int id;
	public String name;
	public String topic;
	public String privacy;
	public String schedule_published_on;
	public VersionModel _version;
	public String organizer_description;
	public String state;
	public String background_image;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String description;

	public RootModel(String type, String organizer_name, String start_time, String code_of_conduct, String location_name, Call_for_papersModel call_for_papers, String timezone, CreatorModel creator, String email, CopyrightModel copyright, String end_time, int id, String name, String topic, String privacy, String schedule_published_on, VersionModel version, String organizer_description, String state, String background_image, String logo, ArrayList<Social_linksModel> social_links, String description) {

		this.type = type;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._creator = creator;
		this.email = email;
		this._copyright = copyright;
		this.end_time = end_time;
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.organizer_description = organizer_description;
		this.state = state;
		this.background_image = background_image;
		this.logo = logo;
		this.social_links = social_links;
		this.description = description;

	}

}