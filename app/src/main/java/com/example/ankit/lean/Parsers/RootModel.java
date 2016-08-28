import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public String logo;
	public CreatorModel _creator;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String timezone;
	public String type;
	public String state;
	public CopyrightModel _copyright;
	public String end_time;
	public String description;
	public String code_of_conduct;
	public String organizer_name;
	public String start_time;
	public String organizer_description;
	public String privacy;
	public String location_name;
	public int id;
	public String email;
	public String background_image;
	public String topic;

	public RootModel(Call_for_papersModel call_for_papers, String name, String logo, CreatorModel creator, VersionModel version, ArrayList<Social_linksModel> social_links, String schedule_published_on, String timezone, String type, String state, CopyrightModel copyright, String end_time, String description, String code_of_conduct, String organizer_name, String start_time, String organizer_description, String privacy, String location_name, int id, String email, String background_image, String topic) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this.logo = logo;
		this._creator = creator;
		this._version = version;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.type = type;
		this.state = state;
		this._copyright = copyright;
		this.end_time = end_time;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.location_name = location_name;
		this.id = id;
		this.email = email;
		this.background_image = background_image;
		this.topic = topic;

	}

}