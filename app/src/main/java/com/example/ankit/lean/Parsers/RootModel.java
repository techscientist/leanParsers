import java.util.ArrayList;

class RootModel {

	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String logo;
	public String type;
	public CopyrightModel _copyright;
	public String timezone;
	public CreatorModel _creator;
	public String email;
	public String start_time;
	public String privacy;
	public String topic;
	public String organizer_description;
	public String background_image;
	public String organizer_name;
	public String description;
	public String location_name;
	public int id;
	public String schedule_published_on;
	public String state;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;

	public RootModel(String end_time, ArrayList<Social_linksModel> social_links, String code_of_conduct, String logo, String type, CopyrightModel copyright, String timezone, CreatorModel creator, String email, String start_time, String privacy, String topic, String organizer_description, String background_image, String organizer_name, String description, String location_name, int id, String schedule_published_on, String state, String name, Call_for_papersModel call_for_papers, VersionModel version) {

		this.end_time = end_time;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.type = type;
		this._copyright = copyright;
		this.timezone = timezone;
		this._creator = creator;
		this.email = email;
		this.start_time = start_time;
		this.privacy = privacy;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.description = description;
		this.location_name = location_name;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._version = version;

	}

}