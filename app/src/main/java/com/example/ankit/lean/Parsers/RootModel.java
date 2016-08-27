import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String email;
	public String state;
	public CreatorModel _creator;
	public String type;
	public String end_time;
	public String background_image;
	public String location_name;
	public String timezone;
	public String privacy;
	public String name;
	public String logo;
	public String description;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String start_time;
	public int id;
	public String organizer_description;

	public RootModel(String schedule_published_on, String email, String state, CreatorModel creator, String type, String end_time, String background_image, String location_name, String timezone, String privacy, String name, String logo, String description, String code_of_conduct, String organizer_name, String topic, ArrayList<Social_linksModel> social_links, VersionModel version, Call_for_papersModel call_for_papers, CopyrightModel copyright, String start_time, int id, String organizer_description) {

		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.state = state;
		this._creator = creator;
		this.type = type;
		this.end_time = end_time;
		this.background_image = background_image;
		this.location_name = location_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.name = name;
		this.logo = logo;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.social_links = social_links;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.start_time = start_time;
		this.id = id;
		this.organizer_description = organizer_description;

	}

}