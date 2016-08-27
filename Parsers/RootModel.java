import java.util.ArrayList;

class RootModel {

	public int id;
	public String type;
	public String topic;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String start_time;
	public String privacy;
	public String logo;
	public String organizer_name;
	public String state;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String name;
	public VersionModel _version;
	public String schedule_published_on;
	public String background_image;
	public String timezone;
	public String description;
	public String code_of_conduct;
	public String email;

	public RootModel(int id, String type, String topic, String organizer_description, ArrayList<Social_linksModel> social_links, String location_name, Call_for_papersModel call_for_papers, String end_time, String start_time, String privacy, String logo, String organizer_name, String state, CreatorModel creator, CopyrightModel copyright, String name, VersionModel version, String schedule_published_on, String background_image, String timezone, String description, String code_of_conduct, String email) {

		this.id = id;
		this.type = type;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.start_time = start_time;
		this.privacy = privacy;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.state = state;
		this._creator = creator;
		this._copyright = copyright;
		this.name = name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.timezone = timezone;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;

	}

}